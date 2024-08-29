package Interfaces.ExercicioFixacao.Model.Services;

public interface OnlinePayamentService {
    
    double payamentFee(double amount) ;
    double interest(double amount, int month);
}
