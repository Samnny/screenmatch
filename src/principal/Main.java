package principal;

public class Main {
    public static void main(String[] args) {

        int anoLancamento = 2022;
        boolean incluidoPlano = true;
        double notaFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) /3;
        int classificacao = (int) media/2;

        String sinopse = """
                            Filme: Top Gun Maverick
                            Avaliação: %.2f
                            Filme de aventura com galã dos anos 80
                            Classificação %d
                        """.formatted(media, classificacao);

        System.out.println(sinopse);
    }
}
