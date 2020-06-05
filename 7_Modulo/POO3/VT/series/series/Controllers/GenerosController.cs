using System;
using Microsoft.AspNetCore.Mvc;
using series.Data;
using series.DTO;
using series.Models;

namespace series.Controllers
{
  public class GenerosController : Controller
  {
    // Injeção de dependencias
    private readonly ApplicationDbContext database;
    public GenerosController(ApplicationDbContext database)
    {
      this.database = database;
    }
    [HttpPost]
    public IActionResult Save(GeneroDTO generoTemporario)
    {

      //   return Content("Opa!");
      if (ModelState.IsValid)
      {
        Genero genero = new Genero();
        genero.Name = generoTemporario.Name;
        genero.Status = true;
        database.Generos.Add(genero);

        // Persistindo no DB
        database.SaveChanges();
        // Redirecionando o usuário
        return RedirectToAction("Generos", "Gestao");

      }
      else
      {
        return View("../Gestao/NewGenero");
      }
    }
  }
}