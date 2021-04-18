public class Team {

    public static class NewTeam {
        public String name;

        public void showResults() {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        class Member {
            private String surname;
            private String name;

            Member (String name, String surname) {
                this.name = name;
                this.surname = surname;
            }
            String getName () { return name; }
            String getSurname () { return surname; }

            String getFullInfo() {
                return this.name + " " + this.surname;

            }

        }




        NewTeam team1 = new NewTeam();
        team1.name = "Champions";




        System.out.println(team1.name);
        System.out.println("Team" + " '" + team1.name + "' " + "consists of: ");


        Member newMember = new Member("Michael", "Scott");

        Member[] members = {
                newMember,
                new Member("John", "Doe"),
                new Member("Sam", "Jackson"),
                new Member("Nathan", "Drake"),


        };
        for (int i = 0; i < members.length; i++)
            {
                System.out.println(members[i].getFullInfo());
            }


        Course c = new Course ();
        c.doIt(team1);
        System.out.println();

    }
}