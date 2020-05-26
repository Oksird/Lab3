import java.io.*;
import java.util.ArrayList;

public class LabThree {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> list = new ArrayList<>();
        String path = "C:\\Users\\mmuza\\Desktop\\yandex\\test.txt";
        Finder finder = new Finder();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        int c;
        while((c=fileReader.read())!=-1){
            list.add((char)c);
        }
        System.out.println("Гласных - "+ finder.findVowel(list));//7
        System.out.println("Согласных - "+ finder.findСonsonant(list));//6
    }
}

class Finder{
    public int findVowel(ArrayList<Character> input){
        int counter = 0;
        for(Character letter : input){
            if(isVowel(letter)==true)
                counter++;
        }
        return counter;
    }

    public int findСonsonant(ArrayList<Character> input){
        int counter = 0;
        for(Character letter : input){
            if(isVowel(letter)==false)
                counter++;
        }
        return counter;
    }

    public boolean isVowel(Character letter){
        switch (letter){
            case 'а':
            case 'А':
            case 'е':
            case 'Е':
            case 'ё':
            case 'Ё':
            case 'и':
            case 'И':
            case 'о':
            case 'О':
            case 'у':
            case 'У':
            case 'ы':
            case 'Ы':
            case 'э':
            case 'Э':
            case 'ю':
            case 'Ю':
            case 'я':
            case 'Я':
                return true;
        }
        return false;
    }

}
