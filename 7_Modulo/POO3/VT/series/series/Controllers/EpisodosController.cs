using System;
using Microsoft.AspNetCore.Mvc;
namespace series.Controllers
{
  public class EpisodosController : Controller
  {
    public IActionResult Save(EpisodioDTO episodioTemporario)
    {
      return Content("Opa");
    }
  }
}