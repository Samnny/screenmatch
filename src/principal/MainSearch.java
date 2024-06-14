package principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exception.YearConversionException;
import model.Title;
import model.TitleOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            String busca = "";
            List<Title> titles = new ArrayList<>();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();


            while (!busca.equalsIgnoreCase("Sair")) {

                System.out.println("Digite um filme para busca: ");
                busca = sc.nextLine().replace(" ", "+");

                if (busca.equalsIgnoreCase("Sair")){
                    break;
                }

                String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=6585022c";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);


                Title myTitle = new Title(myTitleOmdb);
                System.out.println(myTitle);

                titles.add(myTitle);
            }

            System.out.println(titles);

            FileWriter writer = new FileWriter("titles.json");
            writer.write(gson.toJson(titles));
            writer.close();

        } catch (IOException | InterruptedException | IllegalArgumentException | YearConversionException e){

            System.out.println("Aconteceu um erro:");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Programa finalizou!");
        }
    }
}
