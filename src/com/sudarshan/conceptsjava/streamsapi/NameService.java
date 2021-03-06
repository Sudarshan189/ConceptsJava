package com.sudarshan.conceptsjava.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameService {

    public NameService() {
    }

    public List<Name> coverttoUpperCase(List<Name> nameList) {
        return nameList.parallelStream()
                .map(name -> {
                   name.setFirstName(name.getFirstName().toUpperCase());
                   name.setLastName(name.getLastName().toUpperCase());
                   return name;
                }).collect(Collectors.toList());
    }

    public void printNames(List<Name> nameList) {
        nameList.stream()
                .filter(name -> name.getLastName().equals("Shanbhag"))
                .forEach(name -> {
                    System.out.println(name.getFirstName() + " "+ name.getLastName());
                });
    }

    public boolean checkMatch(List<Name> nameList, String keyword) {
       return nameList.stream()
                .allMatch(name -> name.getLastName().toUpperCase().equals(keyword.toUpperCase()));
    }

    public int checkReduce(List<Name> nameList) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(100);
        listInteger.add(200);
        listInteger.add(130);
        int num = listInteger.stream().reduce(0, (total, number) -> total+number);
        return num;
    }

    public void sortNames(List<Name> names) {
        names.stream().sorted()
                .forEach(name -> {
                    System.out.println(name.getFirstName() + " "+ name.getLastName());
                });
    }

    public static void main(String[] args) {
        NameService nameService = new NameService();
        List<Name> names = new ArrayList<>();
        names.add(new Name("John", "Digiri"));
        names.add(new Name("Helboy", "Manic"));
        names.add(new Name("Georgiao", "Armon"));
        names.add(new Name("Mankind", "Dba"));

        //nameService.coverttoUpperCase(names);
        //names.stream().forEach(name -> {System.out.println(name.getFirstName() + " "+ name.getLastName());});

        boolean result = nameService.checkMatch(names, "Armon");

        nameService.sortNames(names);
        nameService.coverttoUpperCase(names);
        names.stream().forEach(name -> System.out.println(name));

        int integers = nameService.checkReduce(names);
        System.out.println(integers);
    }
}
