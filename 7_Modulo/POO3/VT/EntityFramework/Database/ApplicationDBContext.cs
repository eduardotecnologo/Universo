using Microsoft.EntityFrameworkCore;
namespace EntityFramework.Database
{
  public class ApplicationDBContext : DbContext
  {
    public ApplicationDBContext(DbContextOptions<ApplicationDBContext> options) : base(options)
    {
        
    }
  }
}