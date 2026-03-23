import java.util.*;

public class week_1_Assignment_1 {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("SQL");
        skills.add("Spring Boot");
        skills.add("Java");
        skills.add("React");
        skills.add("Docker");
        skills.add("SQL");
        skills.add("AWS");
        System.out.println("Skills stored in ArrayList  " + skills);
//      HashSet
        Set<String> hashSet = new HashSet<>(skills);
        System.out.println("Skills stored in HashSet    " + hashSet);
        System.out.println("Does the hashset contains react?    " + hashSet.contains("React"));
        hashSet.remove("Docker");
        System.out.println("After removing docker   " + hashSet);
        System.out.println("Size of hashset     " + hashSet.size());
//        LinkedHashSet
        System.out.println("==================LinkedHashSet==============");
        Set<String> linkedHashSet = new LinkedHashSet<>(skills);
        System.out.println("Skills stored in LinkedHashSet  " + linkedHashSet);
        System.out.println("Does the LinkedHashSet contains React? " + linkedHashSet.contains("React"));
        linkedHashSet.remove("Docker");
        System.out.println("After removing Docker  " + linkedHashSet);
        System.out.println("Size of LinkedHashSet   " + linkedHashSet.size());
//        TreeSet
        System.out.println("==========TreeSet==========");
        Set<String> treeSet = new TreeSet<>(skills);
        System.out.println("Skills stored in TreeHashSet    " + treeSet);
        System.out.println("Does the LinkedHashSet contains React? " + treeSet.contains("React"));
        treeSet.remove("Docker");

        System.out.println("After removing Docker  " + treeSet);
        System.out.println("Size of TreeSet   " + treeSet.size());
//Extra Skills
        Set<String> extraSkills = new HashSet<>();
        extraSkills.add("Kubernetes");
        extraSkills.add("Python");
        hashSet.addAll(extraSkills);
        System.out.println("After adding extra skills   " + hashSet);
        hashSet.retainAll(treeSet);
        System.out.println("After using retain  " + hashSet);

    }

}

