public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        var oneBoxer=78.2;
        var twoBoxer=82.7;
        var totalWeightBoxer=oneBoxer+twoBoxer;
        System.out.println("Общий вес двух боксеров " + totalWeightBoxer + "кг");
        var differenceWeightBoxer=oneBoxer-twoBoxer;
        System.out.println("Разница между весами боксеров "+differenceWeightBoxer + "кг");
        differenceWeightBoxer=twoBoxer-oneBoxer;
        System.out.println("Вес второго боксера больше веса первого на "+differenceWeightBoxer + "кг");
        var excessWeightBoxer=twoBoxer % oneBoxer;
        System.out.println("Разница между весами боксеров "+excessWeightBoxer + "кг");
        var totalHours=640;
        var timeOneEmployee=8;
        var totalEmployee=totalHours/timeOneEmployee;
        System.out.println("Всего работников в компании - " +totalEmployee + " человек");
        var extraEmployee=94;
        var extraTotalEmployee=totalEmployee+extraEmployee;
        var extraTotalHours=extraTotalEmployee*timeOneEmployee;
        System.out.println("Если в компании работает "+extraTotalEmployee + " человек, то всего " +extraTotalHours + " часов работы может быть поделено между сотрудниками.");}
}

