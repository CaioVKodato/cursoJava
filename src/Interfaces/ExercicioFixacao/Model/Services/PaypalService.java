package Interfaces.ExercicioFixacao.Model.Services;

public class PaypalService implements OnlinePayamentService {

    @Override
    public double payamentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int month) {
        return amount * 0.01 * month;
    }

}
