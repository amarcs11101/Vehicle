package com.abhishek.amar.bean;

/**
 * @author Abhishek Amar
 *
 */
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Entry {
	private String name;
	private String type;
	private List<Entry> subFolder;

	public Entry(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void addChildren(Entry node) {
		if (subFolder == null)
			subFolder = new ArrayList<Entry>();
		subFolder.add(node);
	}

	public static String convertObjectToJson(Entry entryObject) {
		Gson g = new Gson();
		return g.toJson(entryObject);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Entry> getSubDirectory() {
		return subFolder;
	}

	public void setSubDirectory(List<Entry> subDirectory) {
		this.subFolder = subDirectory;
	}

	@Override
	public String toString() {
		return "Entry [name=" + name + ", type=" + type + ", subFolder=" + subFolder + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subFolder == null) ? 0 : subFolder.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entry other = (Entry) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subFolder == null) {
			if (other.subFolder != null)
				return false;
		} else if (!subFolder.equals(other.subFolder))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}