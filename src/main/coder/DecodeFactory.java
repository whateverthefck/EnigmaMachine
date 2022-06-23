package main.coder;

/**
 *
 * @author zed
 */
public class DecodeFactory extends CoderFactory {

    @Override
    public Coder createCoder() {
        return new Decoder();
    }

}
