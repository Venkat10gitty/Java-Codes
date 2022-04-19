package venkat;

public class JavaLabStrings {
        public static void main(String[] args) {
            String text = "VIT was established with the aim of providing quality higher education on par with international standards. It persistently seeks and adopts innovative methods to improve the quality of higher education on a consistent basis. The campus has a cosmopolitan atmosphere with students from all corners of the globe. Experienced and learned teachers are strongly encouraged to nurture the students";
            String search = "aim";

            int count = countMatches(text, search);
            System.out.println("No. of occurrences of the Substring: " +count);
            if(count==0){
                System.out.println("-1");
            }
            System.out.println("Indexes of the Substring: ");
            for (int index = text.indexOf(search); index >= 0;
                 index = text.indexOf(search, index + 1))
            {
                System.out.print(index+ " ");
            }
        }
    public static int countMatches(String text, String str)
    {
        int index = 0, count = 0;
        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                count ++;
                index += str.length();
            } else {
                break;
            }
        }
        return count;
    }
}

