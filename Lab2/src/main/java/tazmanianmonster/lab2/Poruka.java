package tazmanianmonster.lab2;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Nova Poruka")
public class Poruka implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private Boolean IDporuke;

   @org.kie.api.definition.type.Label(value = "Postupak uspio!")
   private java.lang.Boolean porukaTekst;

   public Poruka()
   {
   }

   public java.lang.Boolean getIDporuke()
   {
      return this.IDporuke;
   }

   public void setIDporuke(java.lang.Boolean IDporuke)
   {
      this.IDporuke = IDporuke;
   }

   public java.lang.Boolean getPorukaTekst()
   {
      return this.porukaTekst;
   }

   public void setPorukaTekst(java.lang.Boolean porukaTekst)
   {
      this.porukaTekst = porukaTekst;
   }

   public Poruka(java.lang.Boolean IDporuke, java.lang.Boolean porukaTekst)
   {
      this.IDporuke = IDporuke;
      this.porukaTekst = porukaTekst;
   }

}