package class_work.Task1.Task2;

public class Sport {
        private String teamName;
        private String category;
        private int players;

        public Sport() {
        }

        public String getName() {
            return teamName;
        }

        public void setName(String teamName) {
            this.teamName = teamName;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getPlayers() {
            return players;
        }

        public void setPlayers(int players) {
            this.players = players;
        }

        public Sport(String teamName, String category, int players) {
            this.teamName = teamName;
            this.category = category;
            this.players = players;

        }

}
