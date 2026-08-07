public class Main {
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
        List<Integer> numbers = List.of(1, 2, 3, 3, 4, 4, 4, 5, 5);
        Integer maxrepeatedvalues = numbers.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting())).entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).map(data -> data.getKey()).stream().findFirst().orElse(null);
        System.out.println(maxrepeatedvalues);

        String input = "sathish";
        String reversed = IntStream.rangeClosed(1, input.length()).mapToObj(data -> input.charAt(input.length() - data)).map(data -> String.valueOf(data)).collect(Collectors.joining());
        System.out.println(reversed);

        String input3 = "Malayalam";
        Boolean ispalindrome = IntStream.range(0, input3.length() / 2).allMatch(data -> input3.charAt(data) == input3.charAt(input3.length() - data - 1));
        System.out.println(ispalindrome);

        List<Integer> number = List.of(10, 22, 33, 6, 4);

        int data = number.stream().mapToInt(a -> a).sum();
        System.out.println("sum of all elements" + data);

        int maximum = number.stream().mapToInt(b -> b).max().orElse(0);
        System.out.println("maximum sum of elements" + maximum);

        List<Integer> evennumbers = numbers.stream().filter(inpt -> inpt % 2 == 0).toList();
        System.out.println(evennumbers);

        List<String> animals = List.of("ape", "gorella", "elephant", "monkey");
        List<String> animalsstartswith = animals.stream().filter(d -> d.startsWith("a")).toList();
        System.out.println(animalsstartswith);

        List<String> sortinginnaturalorder = animals.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("sorted order" + sortinginnaturalorder);

        String output = animals.stream().collect(Collectors.joining());
        System.out.println("String value     " + output);

        String maxlength = String.valueOf(animals.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .max(comparingByKey()));

        System.out.println("getting the maximum count from the list strings   " + maxlength);

        String convertinttochars = "a1b2";
        String convertingintochars = "";
        char[] chararray = convertinttochars.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            if (isDigit(chararray[i])) {
                int currentposition = Integer.valueOf(String.valueOf(chararray[i]));
                int previouseposition = (int) chararray[i - 1];
                int convertedasci = previouseposition + currentposition;
                char convertable = (char) convertedasci;
                convertingintochars += convertable;
            } else {
                convertingintochars += String.valueOf(chararray[i]);
            }
        }
        System.out.println(convertingintochars);
        number.stream().sorted(Comparator.reverseOrder()).findFirst();


        List<Integer> evennumber = List.of(10, 20, 30);
        Set<Integer> eveset = evennumber.stream().collect(Collectors.toSet());
        int oddnumbers = eveset.stream().mapToInt(a -> a).sum();
        System.out.println("1" + eveset);
        System.out.println("2" + oddnumbers);

        String username = "sathish";

        Character firstrepeatedvalue = username
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .map(u -> u.getKey())
                .findFirst()
                .orElse(null);

        System.out.println("first non repeating character" + firstrepeatedvalue);

        List<Integer> usingpartionining = List.of(10, 15, 20, 25, 30);
        Map<Boolean, List<Integer>> partionby = usingpartionining.stream().collect(Collectors.partitioningBy(even -> even % 2 == 0));
        System.out.println("partionby" + partionby.get(false));

        List<employee> employeeList = new ArrayList<>();

        Calendar cal = Calendar.getInstance();

        cal.set(2021, Calendar.JANUARY, 10);

        employeeList.add(new employee("sathish", "engineer", 100, cal.getTime()));

        cal.set(2022, Calendar.FEBRUARY, 11);
        employeeList.add(new employee("ramesh", "doctor", 200, cal.getTime()));
        cal.set(2024, Calendar.MARCH, 11);
        employeeList.add(new employee("suresh", "doctor", 150, cal.getTime()));
        employeeList.add(new employee("x", "engineer", 90, new Date()));

        Map<Object, Object> employeemap = employeeList
                .stream()
                .collect(Collectors.toMap(employee::getEmployeeName, employee::getDepartment, (a, b) -> a));
        System.out.println("employeemap" + employeemap);

        double employee = employeeList.stream().mapToDouble(salary -> salary.getSalary()).sum();
        System.out.println("salarysusm" + employee);

        double highestsalary = employeeList.stream().mapToDouble(slry -> slry.getSalary()).max().orElse(0.0);
        System.out.println("employee_highest_salary" + highestsalary);

        String word = "banana";
        Map<Character, Long> words = word.chars().mapToObj(z -> (char) z).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("w" + words);

        String programminglanguage = "java is programming language";
        boolean containsjava = programminglanguage.chars().mapToObj(contains -> (char) contains).toList().contains("java");
        System.out.println("java_present" + containsjava);

        String inp = "programming";

        Map<Character, Long> countoccurence =
                inp
                        .chars()
                        .mapToObj(da -> (char) da)
                        .toList()
                        .stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("counting" + countoccurence);

        List<Character> duplicates = input
                .chars()
                .mapToObj(daa -> (char) daa)
                .toList()
                .stream()
                .collect(Collectors.groupingBy(user -> user, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(o -> o.getKey())
                .toList();

        List<Integer> listnumbers = List.of(11, 15, 23, 35, 41);
        Boolean availableevennumbers = listnumbers.stream().anyMatch(i -> i % 2 == 0);
        System.out.println("even numbers contains" + availableevennumbers);

        List<Integer> allpositivenumbers = List.of(10, 25, 30, 18);
        Boolean allpositive = allpositivenumbers.stream().allMatch(givendata -> givendata > 0);
        System.out.println("postive numbers" + allpositive);

        List<String> names = List.of("John", "Peter", "Alice", "David");
        Boolean startswithA = names.stream().anyMatch(o -> o.startsWith("A"));
        System.out.println("starts with A" + startswithA);

        Boolean earninglesserthan = employeeList.stream().noneMatch(o -> o.getSalary() < 20000);
        System.out.println("earning lesser than 20000" + earninglesserthan);

        Boolean checkifanyemployeebelongstohr = employeeList.stream().anyMatch(emp -> emp.getDepartment().equals("HR"));
        System.out.println("check if any employee belongs to hr" + checkifanyemployeebelongstohr);

        List<List<Integer>> innerlist = List.of(List.of(10, 20, 30), List.of(1, 2, 3, 4, 5, 6));
        System.out.println(innerlist.stream().anyMatch(i -> i.size() > 5));

        List<String> vegetables = List.of("carrot@", "beetroot", "tangerine");
        System.out.println("all are alphabets" + vegetables.stream().allMatch(u -> u.chars().allMatch(Character::isLetter)));

        List<employee> sortingemployee = employeeList.stream().sorted(Comparator.comparing(s -> s.getSalary(), Comparator.reverseOrder())).toList();
        sortingemployee.forEach(p -> System.out.println(p.getSalary()));


        Map<String, Double> departmentbased = sortingemployee.stream().collect(Collectors.groupingBy(employee1 -> employee1.getDepartment(), Collectors.averagingDouble(employee2 -> employee2.getSalary())));
        System.out.println("departmentused" + departmentbased);

        //finding the second highest based on department
        Map<String, employee> secondhighestbasedondepartment = employeeList
                .stream()
                .collect(Collectors.groupingBy(BackendApplication.employee::getDepartment))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .sorted(Comparator.comparing(BackendApplication.employee::getSalary).reversed())
                                .skip(1)
                                .findFirst()
                                .orElse(null)
                ));

        String collagewithnumberandchars = "abc12345";
        String onlynumbers = collagewithnumberandchars.replaceAll("[^a-zA-Z]", "");
        String onlyChars = collagewithnumberandchars.replaceAll("[a-zA-z]", "");

        System.out.println("numbers" + onlynumbers);
        System.out.println("characters" + onlyChars);

        System.out.println("second highest based on department" + secondhighestbasedondepartment);

        Map<String, employee> employeewithhighestsalary = employeeList.stream().collect(Collectors.groupingBy(dep -> dep.getDepartment())).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, use -> use.getValue().stream().max(Comparator.comparing(em -> em.getSalary())).orElse(null)));
        System.out.println("employee_with_salary" + employeewithhighestsalary);

        //grouping by latest dates
        Date latestdate = employeeList.stream().max(Comparator.comparing(BackendApplication.employee::getJoinedDate)).orElseThrow().getJoinedDate();
        Map<String, List<employee>> employeedata = employeeList.stream().collect(Collectors.groupingBy(BackendApplication.employee::getDepartment)).entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey
                        , p -> p.getValue().stream().filter(i -> i.getJoinedDate().equals(latestdate)

                        ).toList()));
        System.out.println("getting the details based on the latest date " + employeedata.toString());

        employee e1 = new employee();
        e1.setDepartment("aernatical");

        employee e2 = new employee();
        e2.setDepartment("aernatical");

        boolean employeeequals = e1.equals(e2);
        System.out.println("employee" + employeeequals);

        Map<String, Double> averagesalary = employeeList.stream().collect(Collectors.groupingBy(BackendApplication.employee::getDepartment))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entity -> entity.getValue().stream().mapToInt(d -> (int) d.salary).average().orElse(0)));

        System.out.println("average salary" + averagesalary);

        String inputgiven = "stress";

        Character newdata =
                input
                        .chars()
                        .mapToObj(da -> (char) da)
                        .toList()
                        .stream()
                        .collect(Collectors.groupingBy(userdata -> userdata,
                                LinkedHashMap::new, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(u -> u.getValue() == 1)
                        .map(x -> x.getKey())
                        .findFirst()
                        .orElse(null);

        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 80);
        map.put("Python", 95);
        map.put("C++", 70);
        map.put("Go", 85);

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        System.out.println("sorted values" + sortedMap);

    }

    static class employee {
        private String employeeName;
        private String department;
        private double salary;
        private Date joinedDate;

        public employee() {
        }

        public Date getJoinedDate() {
            return joinedDate;
        }

        public void setJoinedDate(Date joinedDate) {
            this.joinedDate = joinedDate;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public employee(String employeeName, String department, double salary, Date joinedDate) {
            this.employeeName = employeeName;
            this.department = department;
            this.salary = salary;
            this.joinedDate = joinedDate;
        }
    }
}