package sapiens.core;

public class Layer {

  private final Neuron[] neurons;

  public Layer(Neuron[] neurons) {
    this.neurons = neurons;
  }

  public double[] process(double[] inputs) {
    var outputs = new double[neurons.length];

    for (var i = 0; i < neurons.length; i++) {
      outputs[i] = neurons[i].process(inputs);
    }

    return outputs;
  }
}
