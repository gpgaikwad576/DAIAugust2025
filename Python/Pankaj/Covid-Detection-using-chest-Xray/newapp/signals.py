
from django.db.models.signals import post_save
from django.contrib.auth.models import User
from django.dispatch import receiver


from .models import  Details
from django.conf import settings

@receiver(post_save,sender=User)
def create_details(sender,instance,created,**kwargs):
	if created:
		Details.objects.create(user=instance)


def save_details(sender,instance,**kwargs):
	instance.details.save()

"""
from .models import  Xray


@receiver(post_save,sender=User)
def create_xray(sender,instance,created,**kwargs):
	if created:
		Xray.objects.create(user=instance)


def save_xray(sender,instance,**kwargs):
	instance.xray.save()
"""