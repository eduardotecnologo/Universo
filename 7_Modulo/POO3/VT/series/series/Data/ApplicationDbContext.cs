using System;
using System.Collections.Generic;
using System.Text;
using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;
using series.Models;

namespace series.Data
{
  public class ApplicationDbContext : IdentityDbContext
  {
    public DbSet<Genero> Generos { get; set; }
    public DbSet<Episodio> Episodios { get; set; }
    public DbSet<Serie> Series { get; set; }

    public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options)
        : base(options)
    {
    }
  }
}
