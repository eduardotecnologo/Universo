using System;
using Microsoft.AspNetCore.Mvc;
using series.DTO;

namespace series.Controllers
{
    public class EpisodiosController : Controller
    {
        public IActionResult Save(EpisodioDTO episodioTemporario)
        {
            return Content("opsa");
        }
    }
}
