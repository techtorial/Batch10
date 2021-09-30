package MentoringAhmet.InterviewQuestion;

public class General2 {
    public static void main(String[] args) {
        General general=new General("mehmet","ahmet");
        general.lastname="Sergey" ;
        general.name="Sorin";
        System.out.println(general.name);//Sorin
        System.out.println(general.lastname);//Sergey
        general.run("Arzu","Altynai");//ArzuAltynai
        System.out.println(general.name);//Sorin
        System.out.println(general.lastname);//Sergey

    }
}
