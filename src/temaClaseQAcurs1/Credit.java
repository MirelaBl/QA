package temaClaseQAcurs1;

public class Credit {
    //Scrie o metodă approveCredit() care primește ca parametru un int creditScore, și
    //returnează un string “Declined” dacă scorul < 550, “Maybe” dacă scorul >= 550 și <= 675,
    //sau “We look forward to doing business with you!” dacă scorul > 675. Testează metoda
    //folosind @Before.

    public String approveCredit(int creditScore){
        return  creditScore < 550 ? "Decline" :
                creditScore >= 550 && creditScore <= 675 ? "Maybe" :
                        creditScore > 675 ? "We look forward to doing business with you!" :
                                String.valueOf(creditScore);
    }
}
