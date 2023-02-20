import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Random;

import java.io.IOException;


public class choose {
    public static void main(String[] args) throws IOException {
        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Lists_of_prepared_foods").get();
            Elements paragraphs = doc.select(".mw-content-ltr p, .mw-content-ltr li");

            /*int firstList = 6;
            int lastList = 122;
            org.jsoup.nodes.Element firstParagraph = paragraphs.get(firstList);
            org.jsoup.nodes.Element lastParagraph = paragraphs.get(lastList);*/
            Element p;
            p = paragraphs.get(randArticle());
            System.out.println(p.text());
            /*while (p != lastParagraph) {
                if(firstList != 9 && firstList != 11 && firstList != 20 && firstList != 28 && firstList != 23 && firstList != 57 && firstList != 61 && firstList != 62 && firstList != 78 && firstList != 84 && firstList != 97 && firstList != 99) {

                    p = paragraphs.get(firstList);
                    System.out.println(p.text() + " " + firstList);

                }else if(firstList == 20){

                    System.out.println("List of cheeses" + firstList);

                }else if(firstList == 78) {

                    System.out.println("List of sandwiches"+ firstList);

                }else if(firstList == 84){
                    System.out.println("List of soups"+ firstList);
                }else if(firstList == 97) {
                    System.out.println("List of breads"+ firstList);
                }

                firstList++;
            }*/

        }catch(IOException exception){
            System.out.println("website not connecting.");
        }

    }
    public static int randArticle(){
        Random rand = new Random();
        int j = 6;
        int k = 122;
        int i = rand.nextInt(k - j) + j;
        while(i == 9 || i == 11 || i == 20 || i == 28 || i == 23 || i == 57 || i == 61 || i == 62 || i == 78 || i == 84 || i == 97 || i == 99) {
            i = rand.nextInt(k - j) + j;
        }
        return i;
    }
}
