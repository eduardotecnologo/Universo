using Microsoft.EntityFrameworkCore;
using EntityFramework.Models;

namespace EntityFramework.Database
{
  public class ApplicationDBContext : DbContext
  {
    DbSet<Funcionario> Funcionarios;
    public ApplicationDBContext(DbContextOptions<ApplicationDBContext> options) : base(options)
    {

    }
  }
}