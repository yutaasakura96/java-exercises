public class Wall {
    private double width;
    private double height;

    // No-args constructor
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    // Constructor with parameters
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to set the width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }


    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }
}