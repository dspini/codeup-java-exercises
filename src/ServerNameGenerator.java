public class ServerNameGenerator {

    static String[] adjectives = {"fast", "slow", "broken", "new", "old"};
    static String[] nouns = {"car", "plane", "boat", "bike", "train"};


    static String randomString(String[] words) {
        int randomElement = (int) (Math.random() * words.length);
        return words[randomElement];
    }

    public static void main(String[] args) {
        String adjective = randomString(adjectives);
        String noun = randomString(nouns);
        String serverName = adjective + "-" + noun;
        System.out.printf("Your server name is:%n%s", serverName);
    }

}

