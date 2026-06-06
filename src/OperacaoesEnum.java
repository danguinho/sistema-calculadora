public enum OperacaoesEnum {

    SOMA{
        @Override
        public double calcular(double a, double b){
            return a + b;
        }
    },

    SUBTRACAO{
        @Override
        public double calcular(double a, double b){
            return a - b;
        }
    },

    MULTIPLICACAO{
        @Override
        public double calcular(double a, double b){
            return a * b;
        }
    },

    DIVISAO {
        @Override
        public double calcular(double a, double b){
            return a / b;
        }
    };

    /* Método abstrato - Método sem implementação na classe - define a assinatura
    * que será implementada(parâmetros, nome do método) */
    public abstract double calcular(double a, double b);

}