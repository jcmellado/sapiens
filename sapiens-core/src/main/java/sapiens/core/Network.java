package sapiens.core;

public class Network {

  private final Layer[] layers;

  public Network(Layer[] layers) {
    this.layers = layers;
  }

  public double[] process(double[] inputs) {
    var outputs = inputs;

    for (var i = 0; i < layers.length; i++) {
      outputs = layers[i].process(outputs);
    }

    return outputs;
  }
}
