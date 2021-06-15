package softdev.Part6_lambdas_and_streams.part6;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Class to illustrate the FlatMap operation on a stream
 */
public class Developer {
    private String name;
    private Set<String> languages;

    public Developer(String name) {
        this.name = name;
        this.languages = new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public Collection<String> getLanguages() {
        return this.languages;
    }

    public void addLanguages(String ...languages) {
        for (int i = 0; i < languages.length; i++) {
            this.languages.add(languages[i]);
        }
    }

    public static void main(String[] args) {
        List<Developer> team = new ArrayList<>();
        Developer dev1 = new Developer("Li");
        Developer dev2 = new Developer("Lies");
        Developer dev3 = new Developer("John");

        dev1.addLanguages("Java","C++","Pascal","Python");
        dev2.addLanguages("Java","C","Prolog");
        dev3.addLanguages("Java","C#","Lisp","C#");

        team.add(dev1);
        team.add(dev2);
        team.add(dev3);

        // add languages of the team in a set

        System.out.println(team.stream()
                .map(d -> d.getLanguages().stream())
                .collect(Collectors.toList()));

        System.out.println(team.stream()
                .flatMap(d -> d.getLanguages().stream())
                .collect(Collectors.toSet()));

        System.out.println(team.stream()
                .flatMap(d -> d.getLanguages().stream())
                .collect(Collectors.toCollection(() -> new TreeSet<>())));
//        System.out.println(team.stream()
//                .flatMap(d -> d.getLanguages().stream())
//                .collect(Collectors.toCollection(TreeSet::new)));
        System.out.println(team.stream()
                .flatMap(d -> d.getLanguages().stream())
                .collect(Collectors.toList()));
    }
}
