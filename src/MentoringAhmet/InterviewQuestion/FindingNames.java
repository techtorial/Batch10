package MentoringAhmet.InterviewQuestion;

public class FindingNames {
    public static void main(String[] args) {
        //How many times you find these words in the given String

        String[] name = {"rights","apply"};

        String words = "Typically, the first owner of a copyright is the person who created the work, i.e. the author. If more than one person created the work, then a case of joint authorship can be made provided some criteria are met. In the copyright laws of various jurisdictions, there is a necessity for little flexibility regarding what constitutes authorship. The United States Copyright Office, for example, defines copyright as \"a form of protection provided by the laws of the United States (title 17, U.S. Code) to authors of 'original works of authorship'\".[2]\n" +
                "\n" +
                "Holding the title of \"author\" over any \"literary, dramatic, musical, artistic, [or] certain other intellectual works\" gives rights to this person, the owner of the copyright, especially the exclusive right to engage in or authorize any production or distribution of their work. Any person or entity wishing to use intellectual property held under copyright must receive permission from the copyright holder to use this work, and often will be asked to pay for the use of copyrighted material. After a fixed amount of time, the copyright expires on intellectual work and it enters the public domain, where it can be used without limit. Copyright laws in many jurisdictions – mostly following the lead of the United States, in which the entertainment and publishing industries have very strong lobbying power – have been amended repeatedly since their inception, to extend the length of this fixed period where the work is exclusively controlled by the copyright holder. However, copyright is merely the legal reassurance that one owns his/her work. Technically, someone owns their work from the time it's created. A notable aspect of authorship emerges with copyright in that, in many jurisdictions, it can be passed down to another upon one's death. The person who inherits the copyright is not the author, but enjoys the same legal benefits.\n" +
                "\n" +
                "Questions arise as to the application of copyright law. How does it, for example, apply to the complex issue of fan fiction? If the media agency responsible for the authorized production allows material from fans, what is the limit before legal constraints from actors, music, and other considerations, come into play? Additionally, how does copyright apply to fan-generated stories for books? What powers do the original authors, as well as the publishers, have in regulating or even stopping the fan fiction? This particular sort of case also illustrates how complex intellectual property law can be, since such fiction may also involved trademark law (e.g. for names of characters in media franchises), likeness rights (such as for actors, or even entirely fictional entities), fair use rights held by the public (including the right to parody or satirize), and many other interacting complications.[citation needed]\n" +
                "\n" +
                "Authors may portion out different rights they hold to different parties, at different times, and for different purposes or uses, such as the right to adapt a plot into a film, but only with different character names, because the characters have already been optioned by another company for a television series or a video game. An author may also not have rights when working under contract that they would otherwise have, such as when creating a work for hire (e.g., hired to write a city tour guide by a municipal government that totally owns the copyright to the finished work), or when writing material using intellectual property owned by others (such as when writing a novel or screenplay that is a new installment in an already established media franchise).";
        words = words.replace(",","");


        String[] seperatedWords = words.split(" ");

        for(int i = 0 ; i<name.length;i++){
            int counter = 0;
            for(int k = 0;k<seperatedWords.length;k++){
                if(name[i].equals(seperatedWords[k])){
                    counter++;
                }
            }
            System.out.println(name[i] +"is " + counter+"times in the given String");
        }



    }
}
