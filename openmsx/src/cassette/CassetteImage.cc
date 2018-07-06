// $Id: CassetteImage.cc 12587 2012-06-06 20:31:32Z m9710797 $

#include "CassetteImage.hh"
#include <cassert>

namespace openmsx {

CassetteImage::CassetteImage()
	: firstFileType(UNKNOWN)
{
}

CassetteImage::~CassetteImage()
{
}

CassetteImage::FileType CassetteImage::getFirstFileType() const
{
	return firstFileType;
}

void CassetteImage::setFirstFileType(FileType type)
{
	firstFileType = type;
}

std::string CassetteImage::getFirstFileTypeAsString() const
{
	if (firstFileType == ASCII) {
		return "ASCII";
	} else if (firstFileType == BINARY) {
		return "binary";
	} else if (firstFileType == BASIC) {
		return "BASIC";
	} else {
		return "unknown";
	}
}

void CassetteImage::setSha1Sum(const Sha1Sum& sha1sum_)
{
	assert(sha1sum.empty());
	sha1sum = sha1sum_;
}

const Sha1Sum& CassetteImage::getSha1Sum() const
{
	assert(!sha1sum.empty());
	return sha1sum;
}

} // namespace openmsx