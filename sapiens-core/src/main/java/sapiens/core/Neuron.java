package sapiens.core;

public class Neuron {

  private final double[] weights;

  private final double threshold;

  public Neuron(double[] weigths, double threshold) {
    this.weights = weigths;
    this.threshold = threshold;
  }

  public double process(double[] inputs) {
    var netValue = 0d;

    for (var i = 0; i < weights.length; i++) {
      netValue += weights[i] * inputs[i];
    }

    return netValue >= threshold ? 1d : 0d;
  }
}
