class CalculadoraBinariaImpl implements CalculadoraBinaria {
    @Override
    public String somar(String a, String b) {

        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);

        int resultado = numA + numB;

        return Integer.toBinaryString(resultado);
    }

    @Override
    public String subtrair(String a, String b) {

        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);

        int resultado = numA - numB;

        String resultadoBinario = Integer.toBinaryString(resultado);

        while (resultadoBinario.length() < a.length()) {
            resultadoBinario = "0" + resultadoBinario;
        }

        return resultadoBinario;
    }
}