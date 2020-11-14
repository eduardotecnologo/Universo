using System;
using Microsoft.AspNetCore.Mvc;
using series_vt.Data;
using series_vt.DTO;
using series_vt.Models;

namespace series_vt.Controllers
{
  public class CategoriasController : Controller
  {

    private readonly ApplicationDbContext database;

    public CategoriasController(ApplicationDbContext database)
    {
      this.database = database;
    }

    [HttpPost]
    public IActionResult Salvar(CategoriaDTO categoriaTemporaria)
    {
      if (ModelState.IsValid)
      {
        Categoria categoria = new Categoria();
        categoria.Nome = categoriaTemporaria.Nome;
        categoria.Status = true;
        database.Categorias.Add(categoria);
        database.SaveChanges();
        return RedirectToAction("Categorias", "Gestao");
      }
      else
      {
        return View("../Gestao/NovaCategoria");
      }
    }
  }
}