public class CalculoLente {
    private double esfericoDireito;
    private double esfericoEsquerdo;
    private double cilindricoDireito;
    private double cilindricoEsquerdo;

    public boolean possuiGrauCilindrico(double cilindricoDireito, double cilindricoEsquerdo){
        return !(!(cilindricoDireito != 0) && !(cilindricoEsquerdo != 0));
    }

    public String calculaLente(double esfericoDireito, double esfericoEsquerdo,
                                     double cilindricoDireito, double cilindricoEsquerdo){

        if(((esfericoDireito) == 0 && (esfericoDireito) == 0) &&
                ((esfericoEsquerdo) == 0 && (esfericoEsquerdo) == 0) &&
                ((cilindricoDireito) == 0 && (cilindricoDireito) == 0) &&
                ((cilindricoEsquerdo) == 0 && (cilindricoEsquerdo) == 0)){
            return "A sua visão é perfeita! Gostaria de um óculos para descanso?";
        }

        if(((esfericoDireito) <= -3 && (esfericoDireito) >= -12) &&
                ((esfericoEsquerdo) <= -3 && (esfericoEsquerdo) >= -12)){
            if(!possuiGrauCilindrico(cilindricoDireito, cilindricoEsquerdo)){
                return "A lente Prime é ideal para você!";
            }else{
                if(((cilindricoDireito) <= 0 && (cilindricoDireito) >= -2) &&
                        ((cilindricoEsquerdo) <= 0 && (cilindricoEsquerdo) >= -2)){
                    if(esfericoDireito >= -10 && esfericoEsquerdo >= -10){
                        return "A lente Prime é ideal para você!";
                    }else{
                        return calculaLenteVision(esfericoDireito,esfericoEsquerdo,
                                cilindricoDireito,cilindricoEsquerdo);
                    }
                }else{
                    return calculaLenteVision(esfericoDireito,esfericoEsquerdo,
                            cilindricoDireito,cilindricoEsquerdo);
                    }
            }
        }else{
            return calculaLenteVision(esfericoDireito,esfericoEsquerdo,
                    cilindricoDireito,cilindricoEsquerdo);
            }

    }

    public String calculaLenteVision(double esfericoDireito, double esfericoEsquerdo,
                                      double cilindricoDireito, double cilindricoEsquerdo){
        if(((esfericoDireito) <= 0 && (esfericoDireito) >= -15) &&
                ((esfericoEsquerdo) <= 0 && (esfericoEsquerdo) >= -15) &&
                ((cilindricoDireito) <= 0 && (cilindricoDireito) >= -5) &&
                ((cilindricoEsquerdo) <= 0 && (cilindricoEsquerdo) >= -5)){
            return "A lente Vision é ideal para você!";
        }else {

            return rangeGrauEsferico(esfericoDireito,esfericoEsquerdo) +
                    rangeGrauCilindrico(cilindricoDireito, cilindricoEsquerdo);
        }
    }

    public String rangeGrauEsferico(double esfericoDireito, double esfericoEsquerdo){
        if(((esfericoDireito) < -15 || (esfericoDireito) > 0) ||
                ((esfericoEsquerdo) < -15 || (esfericoEsquerdo) > 0)){
            return "\nSó temos opções de lente para grau esférico entre 0 e -15.";
        }
        return "\nInfelizmente não temos opção de lente para você.";
    }

    public String rangeGrauCilindrico(double cilindricoDireito, double cilindricoEsquerdo){
        if(((cilindricoDireito) < -6 || (cilindricoDireito) > 0) ||
                ((cilindricoEsquerdo) < -6 || (cilindricoEsquerdo) > 0)){
            return "\nSó temos opções de lente para grau cilíndrico entre 0 e -6.";
        }
        return "\nInfelizmente não temos opção de lente para você.";
    }
}
