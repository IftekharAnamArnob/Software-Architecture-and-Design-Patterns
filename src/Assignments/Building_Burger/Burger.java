package Assignments.Building_Burger;



public class Burger {
    private final String size;
    private final boolean cheese;
    private final boolean lettuce;
    private final boolean tomato;
    private final boolean onions;

    private Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.onions = builder.onions;
    }

    // Getters for all fields...

    public String getSize() {
        return size;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasLettuce() {
        return lettuce;
    }

    public boolean hasTomato() {
        return tomato;
    }

    public boolean hasOnions() {
        return onions;
    }

    public static class BurgerBuilder {
        private final String size;
        private boolean cheese;
        private boolean lettuce;
        private boolean tomato;
        private boolean onions;

        public BurgerBuilder(String size) {
            this.size = size;
        }

        public BurgerBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public BurgerBuilder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public BurgerBuilder onions(boolean onions) {
            this.onions = onions;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
