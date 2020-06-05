using System.ComponentModel.DataAnnotations;

namespace series.DTO
{
  public class GeneroDTO
  {
    [Required]
    public int Id { get; set; }

    [Required(ErrorMessage = "Ops! O nome do Genero é Obrigatório.")]
    [StringLength(50, ErrorMessage = "Ops! Nome do Genero está muito grande, tente um nome menor.")]
    [MinLength(5, ErrorMessage = "Ops! O nome do Genero está muito pequeno, escolha um nome com mais detalhes.")]
    public string Name { get; set; }
  }
}