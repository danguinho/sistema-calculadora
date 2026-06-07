public enum OperacaoEnum {

    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;


    public static OperacaoEnum traduzCodigo(int codigo) {
        switch (codigo) {
            case 1:
                return SOMA;
            case 2:
                return SUBTRACAO;
            case 3:
                return MULTIPLICACAO;
            case 4:
                return DIVISAO;
            default:
                break;
        }

        return null;
    }

}