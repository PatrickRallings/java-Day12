import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//---------------- Mooci HashMap Practice Problems Start ----------------
//Mooci Exercise 'Nicknames' <- Start
//        HashMap<String, String> nicknames = new HashMap();
//        nicknames.put("Matthew","Matt");
//        nicknames.put("Michael","Mix");
//        nicknames.put("Arthur","Artie");
//        System.out.println(nicknames.get("Matthew"));
//Mooci Exercise 'Nicknames' <- End

//Mooci Exercise 'Abbreviations' <- Start
//        Abbreviations abbreviations = new Abbreviations();
//        abbreviations.addAbbreviation("e.g.", "for example");
//        abbreviations.addAbbreviation("etc.", "and so on");
//        abbreviations.addAbbreviation("i.e.", "more precisely");
//        String text = "e.g. i.e. etc. lol";
//        for (String part: text.split(" ")) {
//            if(abbreviations.hasAbbreviation(part)) {
//                part = abbreviations.findExplanationFor(part);
//            }
//            System.out.print(part);
//            System.out.print(" ");
//        }
//        System.out.println();
//Mooci Exercise 'Abbreviations' <- End

//Mooci Exercise 'Print me my hashmap' <- Start
//        HashMap<String, String> hashmap = new HashMap<>();
//        hashmap.put("f.e", "for example");
//        hashmap.put("etc.", "and so on");
//        hashmap.put("i.e", "more precisely");
//        Program.printKeys(hashmap);
//        System.out.println("---");
//        Program.printKeysWhere(hashmap, "i");
//        System.out.println("---");
//        Program.printValuesOfKeysWhere(hashmap, ".e");
//Mooci Exercise 'Print me my hashmap' <- End

//Mooci Exercise 'Print me another hashmap' <- Start
//        HashMap<String, Book> hashmap = new HashMap<>();
//        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
//        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
//
//        Program.printValues(hashmap);
//        System.out.println("---");
//        Program.printValueIfNameContains(hashmap, "prejud");
//Mooci Exercise 'Print me another hashmap' <- End

//Mooci Exercise 'I owe you' <- Start
//        IOU mattsIOU = new IOU();
//        mattsIOU.setSum("Arthur", 51.5);
//        mattsIOU.setSum("Michael", 30);
//
//        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
//        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
//Mooci Exercise 'I owe you' <- End
//------------------ Mooci HashMap Practice Problems End ------------------

//---------------- Mooci Interface Practice Problems Start ----------------
//Mooci Exercise: 'TacoBoxes - Part 1 & 2' <- Start
//        (See Interface: TacoBox and implementations TripleTaco and CustomTacos)
//Mooci Exercise 'TacoBoxes - Part 2 & 2' <- End

//Mooci Exercise: 'Interface In A Box - Parts 1-4' <- Start
//            Books book1 = new Books("Fyodor Dostoevsky", "Crime and Punishment", 2);
//            Books book2 = new Books("Robert Martin", "Clean Code", 1);
//            Books book3 = new Books("Kent Beck", "Test Driven Development", 0.5);
//            CDs cd1 = new CDs("Pink Floyd", "Dark Side of the Moon", 1973);
//            CDs cd2 = new CDs("Wigwam", "Nuclear Nightclub", 1975);
//            CDs cd3 = new CDs("Rendezvous Park", "Closer to Being Here", 2012);
//            System.out.println(book1.toString());
//            System.out.println(book2.toString());
//            System.out.println(book3.toString());
//            System.out.println(cd1.toString());
//            System.out.println(cd2.toString());
//            System.out.println(cd3.toString());
//
//            Box box1 = new Box(10);
//            box1.add(new Books("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
//            box1.add(new Books("Robert Martin", "Clean Code", 1.5));
//            box1.add(new Books("Kent Beck", "Test Driven Development", 0.7));
//            box1.add(new CDs("Pink Floyd", "Dark Side of the Moon", 1973));
//            box1.add(new CDs("Wigwam", "Nuclear Nightclub", 1975));
//            box1.add(new CDs("Rendezvous Park", "Closer to Being Here", 2012));
//            System.out.println(box1.toString());
////
//            Box box2 = new Box(15);
//            box2.add(box1);
//Mooci Exercise 'Interface In A Box - Parts 1-4' <- End

//Mooci Exercise: 'List as a method parameter' <- Start
//        List<String> names = new ArrayList<>();
//        names.add("First");
//        names.add("Second");
//        names.add("Third");
//        System.out.println(mainProgram.returnSize(names));
//Mooci Exercise 'List as a method parameter' <- End

//Mooci Exercise: 'Map as a method parameter' <- Start
//        Map<String, String> names = new HashMap<>();
//        names.put("1", "first");
//        names.put("2", "second");
//
//        System.out.println(mainProgram.returnSize(names));
//Mooci Exercise 'Map as a method parameter' <- End
//----------------- Mooci Interface Practice Problems End -----------------
    }
}