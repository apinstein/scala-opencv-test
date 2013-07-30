import org.opencv.core.Mat;
import org.opencv.core.CvType;
import org.opencv.core.Scalar;

object Hello extends App {
    // NOTE that on the FS this is libopencv_java246.dylib
    System.loadLibrary("opencv_java246");

    val m:Mat = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0))
    println("OpenCV Mat: " + m)
}

