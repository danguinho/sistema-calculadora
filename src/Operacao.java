public enum Operacao {

    SOMA("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("*"),
    DIVISAO("/"),
    IGUAL("=");

    private final String sinal;


    Operacao(String sinal) {
        this.sinal = sinal;
    }


    public String getSinal() {
        return sinal;
    }



    public static Operacao converterSinal(String sinal) {
        for(Operacao opera: Operacao.values()){
            if(opera.getSinal().equals(sinal)){
                return opera;
            }

        }

        return null;
    }



}