package main.coder;

/**
 *
 * @author zed
 */
public class EncodeFactory extends CoderFactory {

    @Override
    public Coder createCoder() {
        return new Encoder();
    }

}
