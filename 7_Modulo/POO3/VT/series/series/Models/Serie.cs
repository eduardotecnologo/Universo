namespace series.Models
{
  public class Serie
  {
    public int id { get; set; }
    public string Name { get; set; }
    public Genero Genero { get; set; }
    public Episodio Episodio { get; set; }
    public bool Status { get; set; }
  }
}