package Interfaces.Exercicio.Model.Service;

import java.time.Duration;

import Interfaces.Exercicio.Model.Entities.CarRental;
import Interfaces.Exercicio.Model.Entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental cr) {
        double minutes = Duration.between(cr.getStart(), cr.getFinish()).toMinutes();
        double hours = minutes/ 60;

        double basicPayament;

        if (hours <= 12) {
            basicPayament = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayament = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayament);

        cr.setInvoice(new Invoice(basicPayament, tax));

    }


}
