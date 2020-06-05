using System;
using Microsoft.AspNetCore.Mvc;
using series.Data;
using series.DTO;
using series.Models;

namespace series.Controllers
{
    public class EpisodiosController : Controller
    {
        private readonly ApplicationDbContext database;
        public EpisodiosController(ApplicationDbContext database)
        {
            this.database = database;
        }
        
        [HttpPost]
        public IActionResult Save(EpisodioDTO episodioTemporario)
        {
            if (ModelState.IsValid)
            {
                Episodio episodio = new Episodio();
                episodio.Name = episodioTemporario.Name;
                episodio.Number = episodioTemporario.Number;
                episodio.Season = episodioTemporario.Season;
                episodio.Evaluation = episodioTemporario.Evaluation;
                episodio.Name = episodioTemporario.Name;
                episodio.Status = true;

                // Salvando no Banco
                database.Episodios.Add(episodio);
                database.SaveChanges();
                return RedirectToAction("Episodios", "Gestão");
            }
            else
            {
                return View("../Gestao/NewEpisodio");
            }
            //return Content("opsa");
        }
    }
}
