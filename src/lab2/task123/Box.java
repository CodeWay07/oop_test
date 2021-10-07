package lab2.task123;

public class Box {
    int height;
    int width;
    int depth;

    Box () {
        height = 1;
        width = 1;
        depth = 1;
    }

    Box (int valoare) {
        height = width = depth = valoare;
    }

    Box (int height_, int width_, int depth_) {
        height = height_;
        width = width_;
        depth = depth_;
    }

    void Volume() {
        int volume = this.depth * this.width * this.height;
        System.out.println("The volume is " + volume);
    }

    void SurfaceArea() {
        int area = 2 * (this.height * this.width + this.height * this.depth + this.width * this.depth);
        System.out.println("The surface area is " + area);
    }

}
