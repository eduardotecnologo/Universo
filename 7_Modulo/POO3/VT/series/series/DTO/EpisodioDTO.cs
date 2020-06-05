using System.ComponentModel.DataAnnotations;

namespace series.DTO
{
  public class EpisodioDTO
  {
    [Required]
    public int id { get; set; }

    [Required(ErrorMessage = "Ops! O nome do Episódio é Obrigatório.")]
    [StringLength(50, ErrorMessage = "Ops! Nome do Episódio está muito grande, tente um nome menor.")]
    [MinLength(5, ErrorMessage = "Ops! O nome do Episódio está muito pequeno, escolha um nome com mais detalhes.")]
    public string Name { get; set; }

    [Required(ErrorMessage = "Ops! O número do Episódio é Obrigatório.")]
    public int Number { get; set; }

    [Required(ErrorMessage = "Ops! O nome da temporada é Obrigatório.")]
    public string Season { get; set; }

    public float Evaluation { get; set; }
  }
}