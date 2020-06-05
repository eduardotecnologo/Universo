namespace series.Models
{
  public class Episodio
  {
    public int Id { get; set; }
    public string Name { get; set; }
    public int Number { get; set; }
    public string Season { get; set; }
    public float Evaluation { get; set; }
    public bool Status { get; set; }
  }
}