DESCRIPTION = "Init script for the uvcvideo kernel module"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://uvcvideo-init"
SRC_URI += "file://enable-uvcvideo.cfg"


S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${S}/uvcvideo-init ${D}${sysconfdir}/init.d/uvcvideo
}

inherit update-rc.d

INITSCRIPT_NAME = "uvcvideo"
INITSCRIPT_PARAMS = "defaults"
