package de.uni_hamburg.informatik.swt.se2.mediathek.werkzeuge.vormerken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde;
import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.services.kundenstamm.KundenstammService;
import de.uni_hamburg.informatik.swt.se2.mediathek.services.medienbestand.MedienbestandService;

public class VormerkService {
	   private Map<Medium, VormerkKarte> _vormerkkarten;
	    

	    /**
	     * Der Medienbestand.
	     */
	    private MedienbestandService _medienbestand;

	    /**
	     * Der Kundenstamm.
	     */
	    private KundenstammService _kundenstamm;
	    
	    
	    public VormerkService(KundenstammService kundenstamm,
	            MedienbestandService medienbestand)
	    {
	        assert kundenstamm != null : "Vorbedingung verletzt: kundenstamm  != null";
	        assert medienbestand != null : "Vorbedingung verletzt: medienbestand  != null";
	        _kundenstamm = kundenstamm;
	        _medienbestand = medienbestand;
	        _vormerkkarten = new HashMap<Medium, VormerkKarte>();
	    }
	    
		public List<VormerkKarte> getVormerkKarten()
		{
			return new ArrayList<VormerkKarte>(_vormerkkarten.values());
		}

		public Kunde getVormerkKarteFuer(Medium medium, int platz) {
			if(_vormerkkarten.containsKey(medium))
			{
				return _vormerkkarten.get(medium).getKunde(platz);
			}
			return null;
		}

}
