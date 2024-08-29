package Interfaces.ExercicioFixacao.Model.Services;

import java.time.LocalDate;

import Interfaces.ExercicioFixacao.Model.Entities.Contrato;
import Interfaces.ExercicioFixacao.Model.Entities.Installment;

public class ContractService {
    private OnlinePayamentService onlinePayamentService;


    public ContractService() {
    }


    public ContractService(OnlinePayamentService onlinePayamentService) {
        this.onlinePayamentService = onlinePayamentService;
    }

    public void processContract (Contrato contract, int month) {

        double basicQuota = contract.getTotalValue() / month;
        for (int i=1; i <= month; i++) {
            LocalDate dueDate = contract.getDataContract().plusMonths(i);

            double interest = onlinePayamentService.interest(basicQuota , i);
            double fee = onlinePayamentService.payamentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
