using System;
using Microsoft.AspNetCore.Mvc;
using series_vt.Data;
using series_vt.DTO;
using series_vt.Models;

namespace series_vt.Controllers
{
  public class FornecedoresController : Controller
  {

    private readonly ApplicationDbContext database;

    public FornecedoresController(ApplicationDbContext database)
    {
      this.database = database;
    }


    [HttpPost]
    public IActionResult Salvar(FornecedorDTO fornecedorTemporario)
    {
      if (ModelState.IsValid)
      {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.Nome = fornecedorTemporario.Nome;
        fornecedor.Email = fornecedorTemporario.Email;
        fornecedor.Telefone = fornecedorTemporario.Telefone;
        fornecedor.Status = true;
        database.Fornecedores.Add(fornecedor);
        database.SaveChanges();
        return RedirectToAction("Fornecedores", "Gestao");
      }
      else
      {
        return View("../Gestao/NovoFornecedor");
      }
    }
  }
}