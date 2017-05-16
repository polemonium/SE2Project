package de.uni_hamburg.informatik.swt.se2.mediathek.werkzeuge.vormerken;

import java.util.ArrayList;
import java.util.List;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde;
import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;

public class VormerkKarte {
		Medium _medium;
		List<Kunde> _kunden;
		
		public VormerkKarte(Medium m, Kunde k)
		{
			_medium = m;
			_kunden = new ArrayList<Kunde>();
			_kunden.add(k);
		}
		
		public Kunde getKunde(int platz)
		{
			return _kunden.get(platz);
		}
}
