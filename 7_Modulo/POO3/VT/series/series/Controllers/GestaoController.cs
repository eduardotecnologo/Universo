using System;
using Microsoft.AspNetCore.Mvc;

namespace series.Controllers
{
  public class GestaoController : Controller
  {
    public IActionResult Index()
    {
      return View();
    }

    public IActionResult Generos()
    {
      return View();
    }
    public IActionResult NewGenero()
    {
      return View();
    }
  }
}